/* Generated By:JJTree: Do not edit this line. ASTportDecl.java */

package com.google.code.p.relaxws.parser;

import com.google.code.p.relaxws.parser.SimpleNode;
import com.google.code.p.relaxws.parser.RelaxWizParser;

public class ASTportDecl extends SimpleNode {
    private String name;

  public ASTportDecl(int id) {
    super(id);
  }

  public ASTportDecl(RelaxWizParser p, int id) {
    super(p, id);
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
