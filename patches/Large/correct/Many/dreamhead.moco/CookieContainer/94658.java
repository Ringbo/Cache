diff --git a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/CookieContainer.java b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/CookieContainer.java
index 873fb6f..7134239 100644
--- a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/CookieContainer.java
+++ b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/CookieContainer.java
@@ -39,19 +39,19 @@
         return container;
     }
 
-    public String getValue() {
+    public final String getValue() {
         return value;
     }
 
-    public boolean isForTemplate() {
+    public final boolean isForTemplate() {
         return this.template != null;
     }
 
-    public String getTemplate() {
+    public final String getTemplate() {
         return template;
     }
 
-    public CookieAttribute[] getOptions() {
+    public final CookieAttribute[] getOptions() {
         List<CookieAttribute> options = newArrayList();
         if (this.path != null) {
             options.add(CookieAttribute.path(this.path));
