diff --git a/src/java/org/apache/commons/lang/builder/CompareToBuilder.java b/src/java/org/apache/commons/lang/builder/CompareToBuilder.java
index d8eb64d..f986c64 100644
--- a/src/java/org/apache/commons/lang/builder/CompareToBuilder.java
+++ b/src/java/org/apache/commons/lang/builder/CompareToBuilder.java
@@ -109,7 +109,7 @@
  * @author Gary Gregory
  * @author Pete Gieser
  * @since 1.0
- * @version $Id: CompareToBuilder.java,v 1.18 2003/07/21 23:14:37 scolebourne Exp $
+ * @version $Id: CompareToBuilder.java,v 1.19 2003/07/21 23:32:41 scolebourne Exp $
  */
 public class CompareToBuilder {
     
@@ -282,7 +282,7 @@
         if (comparison != 0) {
             return this;
         }
-        comparison = superHashCode;
+        comparison = superCompareTo;
         return this;
     }
     
