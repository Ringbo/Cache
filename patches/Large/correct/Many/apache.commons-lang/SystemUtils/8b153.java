diff --git a/src/java/org/apache/commons/lang/SystemUtils.java b/src/java/org/apache/commons/lang/SystemUtils.java
index 1b4cfc6..206a62f 100644
--- a/src/java/org/apache/commons/lang/SystemUtils.java
+++ b/src/java/org/apache/commons/lang/SystemUtils.java
@@ -61,7 +61,7 @@
  * @author Based on code from Lucene
  * @author <a href="mailto:scolebourne@apache.org">Stephen Colebourne</a>
  * @author <a href="mailto:sdowney@panix.com">Steve Downey</a>
- * @version $Id: SystemUtils.java,v 1.4 2002/11/16 10:41:03 scolebourne Exp $
+ * @version $Id: SystemUtils.java,v 1.5 2002/11/22 23:32:45 bayard Exp $
  */
 public class SystemUtils {
     
@@ -442,7 +442,7 @@
      * @return <code>true</code> if the actual version is equal or greater
      *  than the required version
      */
-    public boolean isJavaVersionAtLeast(float requiredVersion) {
+    public static boolean isJavaVersionAtLeast(float requiredVersion) {
         return (getJavaVersion() >= requiredVersion);
     }
     
