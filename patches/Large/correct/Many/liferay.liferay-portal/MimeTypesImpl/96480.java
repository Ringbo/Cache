diff --git a/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java b/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
index 97e29e7..6cfa392 100644
--- a/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/MimeTypesImpl.java
@@ -201,7 +201,10 @@
 		return _webImageMimeTypes.contains(mimeType);
 	}
 
-	protected void read(InputStream stream) throws Exception {
+	protected void read(
+			InputStream stream, Map<String, Set<String>> extensionsMap)
+		throws Exception {
+
 		DocumentBuilderFactory documentBuilderFactory =
 			DocumentBuilderFactory.newInstance();
 
@@ -228,12 +231,14 @@
 			Element childElement = (Element)node;
 
 			if (MIME_TYPE_TAG.equals(childElement.getTagName())) {
-				readMimeType(childElement);
+				readMimeType(childElement, extensionsMap);
 			}
 		}
 	}
 
-	protected void readMimeType(Element element) {
+	protected void readMimeType(
+		Element element, Map<String, Set<String>> extensionsMap) {
+
 		Set<String> mimeTypes = new HashSet<>();
 
 		Set<String> extensions = new HashSet<>();
@@ -283,7 +288,7 @@
 		}
 
 		for (String mimeType : mimeTypes) {
-			_extensionsMap.put(mimeType, extensions);
+			extensionsMap.put(mimeType, extensions);
 		}
 	}
 
