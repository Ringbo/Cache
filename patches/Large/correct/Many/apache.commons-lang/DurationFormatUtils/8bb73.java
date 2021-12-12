diff --git a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
index 237705f..ad93df2 100644
--- a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
+++ b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
@@ -62,7 +62,7 @@
  * @author Stephen Colebourne
  * @author <a href="mailto:ggregory@seagullsw.com">Gary Gregory</a>
  * @since 2.0
- * @version $Id: DurationFormatUtils.java,v 1.6 2003/09/07 14:32:35 psteitz Exp $
+ * @version $Id: DurationFormatUtils.java,v 1.7 2003/12/20 22:19:21 psteitz Exp $
  */
 class DurationFormatUtils {
     // TODO: Make class public once methods can fully select which fields to output
@@ -81,7 +81,7 @@
      * with XML Schema durations particularly in mind.</p>
      * 
      * <p>This format represents the Gregorian year, month, day, hour, minute, and second components defined 
-     * in � 5.5.3.2 of ISO 8601, respectively. These components are ordered in their significance by their order 
+     * in section 5.5.3.2 of ISO 8601, respectively. These components are ordered in their significance by their order 
      * of appearance i.e. as year, month, day, hour, minute, and second.</p>
      * 
      * <p>The ISO8601 extended format P<i>n</i>Y<i>n</i>M<i>n</i>DT<i>n</i>H<i>n</i>M<i>n</i>S, where <i>n</i>Y 
@@ -133,25 +133,17 @@
     }
 
     /**
-     * <p>Format an elapsed time into a plurialization correct string.
-     * It is limited only to report elapsed time in minutes and
-     * seconds and has the following behavior.</p>
-     *
-     * <ul>
-     *  <li>minutes are not displayed when <code>0</code> (ie:
-     *   &quot;45 seconds&quot;)</li>.
-     *  <li>seconds are always displayed in plural form (ie
-     *   &quot;0 seconds&quot; or &quot;10 seconds&quot;) except
-     *   for <code>1</code> (ie &quot;1 second&quot;)</li>
-     *  </ul>
+     * <p>Format an elapsed time into a plurialization correct string.</p>
      * 
      * @param millis  the elapsed time to report in milliseconds
-     * @return the formatted text in minutes/seconds
+     * @param suppressLeadingZeroElements suppresses leading 0 elements
+     * @param suppressTrailingZeroElements suppresses trailing 0 elements
+     * @return the formatted text in days/hours/minutes/seconds
      */
     public static String formatWords(
         long millis,
-        boolean supressLeadingZeroElements,
-        boolean supressTrailingZeroElements) {
+        boolean suppressLeadingZeroElements,
+        boolean suppressTrailingZeroElements) {
         long[] values = new long[4];
         values[0] = millis / DateUtils.MILLIS_IN_DAY;
         values[1] = (millis / DateUtils.MILLIS_IN_HOUR) % 24;
@@ -168,11 +160,11 @@
             if (value == 0) {
                 // handle zero
                 if (valueOutput) {
-                    if (supressTrailingZeroElements == false) {
+                    if (suppressTrailingZeroElements == false) {
                         buf.append('0').append(fieldsPlural[i]);
                     }
                 } else {
-                    if (supressLeadingZeroElements == false) {
+                    if (suppressLeadingZeroElements == false) {
                         buf.append('0').append(fieldsPlural[i]);
                     }
                 }
