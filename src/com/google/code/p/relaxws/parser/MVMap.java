package com.google.code.p.relaxws.parser;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

public class MVMap {
	private LinkedHashMap<String,MVKey> keys;
	private String mapname;
	
	private class MVKey {
		String name=null;
		Pattern pattern=null;
		boolean multivalue=false;
		boolean unique=true;
		Collection<String> values=null;
	}
	
	
	/**
		String[][] keys={ 
				"name",          //name of the value
				"pattern",       //validator for the values
				Boolean.FALSE,   //multivalue
				Boolean.TRUE,    //unique. used only if multivalue is true
				"initial value"
		}
	*/
	public MVMap(String mapname,Object[][]keys){
		this.mapname=mapname;
		this.keys=new LinkedHashMap(keys.length);
		for(int i=0;i<keys.length;i++){
			MVKey key=new MVKey();
			for(int j=0;j<keys[i].length;j++){
				switch(j){
					case 0: key.name=(String)keys[i][j]; 
						break;
					case 1: key.pattern=Pattern.compile((String)keys[i][j]); 
						break;
					case 2: key.multivalue=((Boolean)keys[i][j]).booleanValue(); 
						break;
					case 3: key.unique=((Boolean)keys[i][j]).booleanValue(); 
						break;
					case 4: 
						if(key.unique)key.values=new LinkedHashSet();
						else key.values=new ArrayList();
						if(keys[i][j]!=null)key.values.add( (String)keys[i][j] );
						break;
				}
			}
			this.keys.put(key.name,key);
		}
	}
	
	private MVKey getKey(String name){
		MVKey key=keys.get(name);
		if(key==null)throw new RuntimeException("Wrong key name = `"+name+"` for the "+this.mapname);
		return key;
	}
	
	public Collection<String> getValues(String name){
		return getKey(name).values;
	}
	
	//returns first value
	public String getValue(String name){
		MVKey key = getKey(name);
		if(key.values.size()<1)throw new RuntimeException("The key with name `"+name+"` is required. "+this);
		return getKey(name).values.iterator().next();
	}
	
	//returns first value
	public String getValue(String name, String defValue){
		MVKey key = getKey(name);
		if(key.values.size()<1)return defValue;
		return getKey(name).values.iterator().next();
	}
	
	private String text(Object value){
		if(value==null)return "";
		if(value instanceof String)return (String)value;
		return value.toString();
	}
	
	public void setValue(Object _name, Object _value){
		String name=text(_name);
		String svalue=text(_value);
		
		MVKey key=getKey(name);
		
		if( !key.pattern.matcher(svalue).matches() )throw new RuntimeException("Wrong "+this.mapname+" value: `"+svalue+"` for the name `"+name+"`. Valid expression: `"+key.pattern+"`");
		
		if(key.multivalue){
			key.values.add(svalue);
		}else{
			key.values.clear();
			key.values.add(svalue);
		}
	}
	
	public String toString(){
		StringBuilder s=new StringBuilder();
		s.append("<");
		s.append(mapname);
		s.append(">[");
		for(String i:keys.keySet()){
			s.append( " " );
			s.append( i );
			s.append( ":" );
			s.append( keys.get(i).values );
			s.append( ", " );
			
		}
		s.append("]");
		return s.toString();
	}
	
}


