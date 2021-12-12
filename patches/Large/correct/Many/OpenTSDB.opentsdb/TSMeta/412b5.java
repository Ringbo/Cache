diff --git a/src/meta/TSMeta.java b/src/meta/TSMeta.java
index f3afff2..bade66c 100644
--- a/src/meta/TSMeta.java
+++ b/src/meta/TSMeta.java
@@ -940,7 +940,7 @@
   }
 
   /** @return the tag UID meta objects in an array, tagk first, then tagv, etc */
-  public final ArrayList<UIDMeta> getTags() {
+  public final List<UIDMeta> getTags() {
     return tags;
   }
 
@@ -965,7 +965,7 @@
   }
 
   /** @return optional custom key/value map, may be null */
-  public final HashMap<String, String> getCustom() {
+  public final Map<String, String> getCustom() {
     return custom;
   }
 
@@ -1037,13 +1037,13 @@
   }
   
   /** @param custom optional key/value map */
-  public final void setCustom(final HashMap<String, String> custom) {
+  public final void setCustom(final Map<String, String> custom) {
     // equivalency of maps is a pain, users have to submit the whole map
     // anyway so we'll just mark it as changed every time we have a non-null
     // value
     if (this.custom != null || custom != null) {
       changed.put("custom", true);
-      this.custom = custom;
+      this.custom = new HashMap<String, String>(custom);
     }
   }
 
