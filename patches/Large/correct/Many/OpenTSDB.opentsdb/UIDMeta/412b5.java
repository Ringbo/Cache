diff --git a/src/meta/UIDMeta.java b/src/meta/UIDMeta.java
index 6e7be89..315b4b5 100644
--- a/src/meta/UIDMeta.java
+++ b/src/meta/UIDMeta.java
@@ -588,13 +588,13 @@
   }
 
   /** @param custom the custom to set */
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
 
