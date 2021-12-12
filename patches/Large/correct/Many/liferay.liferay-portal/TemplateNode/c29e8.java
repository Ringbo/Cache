diff --git a/portal-kernel/src/com/liferay/portal/kernel/templateparser/TemplateNode.java b/portal-kernel/src/com/liferay/portal/kernel/templateparser/TemplateNode.java
index 3809666..7800576 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/templateparser/TemplateNode.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/templateparser/TemplateNode.java
@@ -124,7 +124,7 @@
 	public String getData() {
 		String type = getType();
 
-		if (type.equals("document_library")) {
+		if (type.equals("document_library") || type.equals("image")) {
 			String data = (String)get("data");
 
 			try {
