diff --git a/src/main/java/net/sf/jabref/specialfields/SpecialFieldValue.java b/src/main/java/net/sf/jabref/specialfields/SpecialFieldValue.java
index ff25830..259c0dc 100644
--- a/src/main/java/net/sf/jabref/specialfields/SpecialFieldValue.java
+++ b/src/main/java/net/sf/jabref/specialfields/SpecialFieldValue.java
@@ -102,10 +102,7 @@
 
     public SpecialFieldAction getAction(JabRefFrame frame) {
         if (this.action == null) {
-            action = new SpecialFieldAction(
-                    frame,
-                    this.field,
- this.getFieldValue().get(),
+            action = new SpecialFieldAction(frame, this.field, this.getFieldValue().orElse(null),
                     // if field contains only one value, it has to be nulled
                     // otherwise, another setting does not empty the field
                     this.field.getValues().size() == 1,
