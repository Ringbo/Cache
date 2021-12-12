diff --git a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
index 415d28e..8df79b4 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
@@ -731,7 +731,7 @@
 	}
 
 	public void setDefaultTimeoutImplicit() {
-		throw new UnsupportedOperationException();
+		WebDriverHelper.setDefaultTimeoutImplicit(this);
 	}
 
 	@Override
@@ -755,7 +755,7 @@
 	}
 
 	public void setTimeoutImplicit(String timeout) {
-		WebDriverHelper.setDefaultTimeoutImplicit(this);
+		WebDriverHelper.setTimeoutImplicit(this, timeout);
 	}
 
 	@Override
