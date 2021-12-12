diff --git a/src/meta/Annotation.java b/src/meta/Annotation.java
index 58d4fc0..0287d41 100644
--- a/src/meta/Annotation.java
+++ b/src/meta/Annotation.java
@@ -558,7 +558,7 @@
   }
 
   /** @return the custom key/value map, may be null */
-  public final HashMap<String, String> getCustom() {
+  public final Map<String, String> getCustom() {
     return custom;
   }
 
@@ -597,13 +597,13 @@
   }
 
   /** @param custom the custom key/value map */
-  public void setCustom(final HashMap<String, String> custom) {
+  public void setCustom(final Map<String, String> custom) {
     // equivalency of maps is a pain, users have to submit the whole map
     // anyway so we'll just mark it as changed every time we have a non-null
     // value
     if (this.custom != null || custom != null) {
       changed.put("custom", true);
-      this.custom = custom;
+      this.custom = new HashMap<String, String>(custom);
     }
   }
 }
