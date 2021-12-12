diff --git a/src/web/core/src/main/java/org/geoserver/web/admin/CoverageAccessPage.java b/src/web/core/src/main/java/org/geoserver/web/admin/CoverageAccessPage.java
index 2e440e3..2058829 100644
--- a/src/web/core/src/main/java/org/geoserver/web/admin/CoverageAccessPage.java
+++ b/src/web/core/src/main/java/org/geoserver/web/admin/CoverageAccessPage.java
@@ -113,7 +113,7 @@
         imageIOCacheThreshold.add(RangeValidator.minimum(0l));
         form.add(imageIOCacheThreshold);
                 
-        Button submit = new Button("submit", new StringResourceModel("submit", this, null)) {
+        Button submit = new Button("submit") {
             private static final long serialVersionUID = 4149741045073254811L;
             @Override
             public void onSubmit() {
