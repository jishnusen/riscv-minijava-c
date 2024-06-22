//
// Generated by JTB 1.3.2
//

package IR.syntaxtree;

import IR.visitor.GJNoArguVisitor;
import IR.visitor.GJVisitor;
import IR.visitor.GJVoidVisitor;
import IR.visitor.Visitor;

/**
 * Grammar production:
 * f0 -> <STRINGCONSTANT>
 */
public class StringLiteral implements Node {
   public NodeToken f0;

   public StringLiteral(NodeToken n0) {
      f0 = n0;
   }

   public StringLiteral() {
      f0 = new NodeToken("\"");
   }

   public void accept(Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

