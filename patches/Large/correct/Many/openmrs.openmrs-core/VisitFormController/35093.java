diff --git a/web/src/main/java/org/openmrs/web/controller/visit/VisitFormController.java b/web/src/main/java/org/openmrs/web/controller/visit/VisitFormController.java
index a322aa2..5990f27 100644
--- a/web/src/main/java/org/openmrs/web/controller/visit/VisitFormController.java
+++ b/web/src/main/java/org/openmrs/web/controller/visit/VisitFormController.java
@@ -326,7 +326,7 @@
 	
 	@ModelAttribute("visitTypes")
 	public List<VisitType> getVisitTypes() throws Exception {
-		return Context.getVisitService().getAllVisitTypes(true);
+		return Context.getVisitService().getAllVisitTypes();
 	}
 	
 	@ModelAttribute("attributeTypes")
