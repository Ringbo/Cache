diff --git a/src/java/org/apache/commons/lang/mutable/MutableInteger.java b/src/java/org/apache/commons/lang/mutable/MutableInteger.java
index a519d3a..cb36113 100755
--- a/src/java/org/apache/commons/lang/mutable/MutableInteger.java
+++ b/src/java/org/apache/commons/lang/mutable/MutableInteger.java
@@ -19,7 +19,7 @@
  * A mutable <code>Integer</code>.
  * 
  * @since 2.1
- * @version $Id: MutableInteger.java,v 1.3 2004/06/24 04:20:46 bayard Exp $
+ * @version $Id: MutableInteger.java,v 1.4 2004/06/27 05:23:47 bayard Exp $
  */
 public class MutableInteger extends MutableNumber {
 
@@ -55,7 +55,7 @@
     }
 
     public Object getValue() {
-        return new Float(this.value);
+        return new Integer(this.value);
     }
 
     public void setValue(Object value) {
