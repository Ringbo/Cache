diff --git a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
index 1054abb..80a73b7 100644
--- a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
+++ b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
@@ -41,7 +41,7 @@
  * @author <a href="mailto:ggregory@seagullsw.com">Gary Gregory</a>
  * @author Henri Yandell
  * @since 2.1
- * @version $Id: DurationFormatUtils.java,v 1.16 2004/09/27 03:30:10 bayard Exp $
+ * @version $Id: DurationFormatUtils.java,v 1.17 2004/09/27 03:31:59 bayard Exp $
  */
 public class DurationFormatUtils {
 
@@ -119,7 +119,7 @@
      */
     public static String format(long millis, String format, boolean padWithZeros, TimeZone timezone) {
 
-        if(millis > 28 * DateUtils.MILLIS_PER_DAY) {
+        if(millis >= 28 * DateUtils.MILLIS_PER_DAY) {
             Calendar c = Calendar.getInstance(timezone);
             c.set(1970, 0, 1, 0, 0, 0);
             c.set(Calendar.MILLISECOND, 0);
