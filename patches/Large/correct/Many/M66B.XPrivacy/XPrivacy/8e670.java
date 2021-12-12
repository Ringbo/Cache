diff --git a/src/biz/bokhorst/xprivacy/XPrivacy.java b/src/biz/bokhorst/xprivacy/XPrivacy.java
index bc6d5da..e5316f8 100644
--- a/src/biz/bokhorst/xprivacy/XPrivacy.java
+++ b/src/biz/bokhorst/xprivacy/XPrivacy.java
@@ -342,7 +342,7 @@
 							if (xparam.hasResult())
 								param.setResult(xparam.getResult());
 							if (xparam.hasThrowable())
-								param.setResult(xparam.getThrowable());
+								param.setThrowable(xparam.getThrowable());
 						} catch (Throwable ex) {
 							Util.bug(null, ex);
 						}
