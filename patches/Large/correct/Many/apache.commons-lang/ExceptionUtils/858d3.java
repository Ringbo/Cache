diff --git a/src/java/org/apache/commons/lang/exception/ExceptionUtils.java b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
index e435db0..7a6b2fd 100644
--- a/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
+++ b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
@@ -80,7 +80,7 @@
  * @author Stephen Colebourne
  * @author <a href="mailto:ggregory@seagullsw.com">Gary Gregory</a>
  * @since 1.0
- * @version $Id: ExceptionUtils.java,v 1.29 2003/07/26 13:05:21 scolebourne Exp $
+ * @version $Id: ExceptionUtils.java,v 1.30 2003/07/26 14:22:21 scolebourne Exp $
  */
 public class ExceptionUtils {
     
@@ -354,7 +354,7 @@
         for (int i = 0, isize = CAUSE_METHOD_NAMES.length; i < isize; i++) {
             try {
                 Method method = cls.getMethod(CAUSE_METHOD_NAMES[i], null);
-                if (method != null) {
+                if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
                     return true;
                 }
             } catch (NoSuchMethodException ignored) {
