diff --git a/modules/activiti-modeler/src/main/java/org/activiti/rest/editor/main/StencilsetRestResource.java b/modules/activiti-modeler/src/main/java/org/activiti/rest/editor/main/StencilsetRestResource.java
index b07c4a7..4502b19 100644
--- a/modules/activiti-modeler/src/main/java/org/activiti/rest/editor/main/StencilsetRestResource.java
+++ b/modules/activiti-modeler/src/main/java/org/activiti/rest/editor/main/StencilsetRestResource.java
@@ -27,11 +27,11 @@
 @RestController
 public class StencilsetRestResource {
   
-  @RequestMapping(value="/editor/stencilset", method = RequestMethod.GET, produces = "application/json")
+  @RequestMapping(value="/editor/stencilset", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody String getStencilset() {
     InputStream stencilsetStream = this.getClass().getClassLoader().getResourceAsStream("stencilset.json");
     try {
-      return IOUtils.toString(stencilsetStream);
+      return IOUtils.toString(stencilsetStream, "utf-8");
     } catch (Exception e) {
       throw new ActivitiException("Error while loading stencil set", e);
     }
