diff --git a/src/main/java/com/github/dockerjava/api/model/ObjectVersion.java b/src/main/java/com/github/dockerjava/api/model/ObjectVersion.java
index 6181a9e..9c8d7d9 100644
--- a/src/main/java/com/github/dockerjava/api/model/ObjectVersion.java
+++ b/src/main/java/com/github/dockerjava/api/model/ObjectVersion.java
@@ -22,13 +22,13 @@
     private static final long serialVersionUID = 1L;
 
     @JsonProperty("Index")
-    private Integer index = null;
+    private Long index = null;
 
-    public Integer getIndex() {
+    public Long getIndex() {
         return index;
     }
 
-    public ObjectVersion withIndex(Integer index) {
+    public ObjectVersion withIndex(Long index) {
         this.index = index;
         return this;
     }
