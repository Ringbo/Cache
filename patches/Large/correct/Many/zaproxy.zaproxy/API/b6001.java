diff --git a/src/org/zaproxy/zap/extension/api/API.java b/src/org/zaproxy/zap/extension/api/API.java
index 8f03648..0fa9bf1 100644
--- a/src/org/zaproxy/zap/extension/api/API.java
+++ b/src/org/zaproxy/zap/extension/api/API.java
@@ -365,7 +365,7 @@
 						}
 					} catch (IllegalArgumentException e) {
 						format = Format.HTML;
-						throw new ApiException(ApiException.Type.BAD_FORMAT);
+						throw new ApiException(ApiException.Type.BAD_FORMAT, e);
 					}
 				}
 				if (elements.length > 4) {
@@ -379,7 +379,7 @@
 					try {
 						reqType = RequestType.valueOf(elements[5]);
 					} catch (IllegalArgumentException e) {
-						throw new ApiException(ApiException.Type.BAD_TYPE);
+						throw new ApiException(ApiException.Type.BAD_TYPE, e);
 					}
 				}
 				if (elements.length > 6) {
