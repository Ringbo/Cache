diff --git a/library/src/main/java/com/mikepenz/materialdrawer/holder/StringHolder.java b/library/src/main/java/com/mikepenz/materialdrawer/holder/StringHolder.java
index f06869e..60f3a40 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/holder/StringHolder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/holder/StringHolder.java
@@ -6,7 +6,7 @@
  * Created by mikepenz on 13.07.15.
  */
 public class StringHolder extends com.mikepenz.materialize.holder.StringHolder {
-    public StringHolder(String text) {
+    public StringHolder(CharSequence text) {
         super(text);
     }
 
