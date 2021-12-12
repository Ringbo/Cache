diff --git a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/pre/FormBodyWrapperFilter.java b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/pre/FormBodyWrapperFilter.java
index 35a3a45..4231ecc 100644
--- a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/pre/FormBodyWrapperFilter.java
+++ b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/pre/FormBodyWrapperFilter.java
@@ -184,10 +184,10 @@
 					MultipartRequest multi = (MultipartRequest) this.request;
 					for (Entry<String, List<MultipartFile>> parts : multi
 							.getMultiFileMap().entrySet()) {
-						for (Part file : this.request.getParts()) {
+						for (MultipartFile file : parts.getValue()) {
 							HttpHeaders headers = new HttpHeaders();
 							headers.setContentDispositionFormData(file.getName(),
-									file.getSubmittedFileName());
+									file.getOriginalFilename());
 							if (file.getContentType() != null) {
 								headers.setContentType(
 										MediaType.valueOf(file.getContentType()));
