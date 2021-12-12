diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 2128213..7b665fd 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -906,26 +906,28 @@
 		if (name.equals("getIsimImpu"))
 			return null;
 
-		if (name.equals("getNetworkCountryIso")) {
+		if (name.equals("getNetworkCountryIso") || name.equals("gsm.operator.iso-country")) {
 			// ISO country code
 			String value = getSetting(null, null, uid, cSettingCountry, "XX", true);
 			return (cValueRandom.equals(value) ? getRandomProp("ISO3166") : value);
 		}
-		if (name.equals("getNetworkOperator")) // MCC+MNC: test network
+		if (name.equals("getNetworkOperator") || name.equals("gsm.operator.numeric"))
+			// MCC+MNC: test network
 			return getSetting(null, null, uid, cSettingMcc, "001", true)
 					+ getSetting(null, null, uid, cSettingMnc, "01", true);
-		if (name.equals("getNetworkOperatorName"))
+		if (name.equals("getNetworkOperatorName") || name.equals("gsm.operator.alpha"))
 			return getSetting(null, null, uid, cSettingOperator, cDeface, true);
 
-		if (name.equals("getSimCountryIso")) {
+		if (name.equals("getSimCountryIso") || name.equals("gsm.sim.operator.iso-country")) {
 			// ISO country code
 			String value = getSetting(null, null, uid, cSettingCountry, "XX", true);
 			return (cValueRandom.equals(value) ? getRandomProp("ISO3166") : value);
 		}
-		if (name.equals("getSimOperator")) // MCC+MNC: test network
+		if (name.equals("getSimOperator") || name.equals("gsm.sim.operator.numeric"))
+			// MCC+MNC: test network
 			return getSetting(null, null, uid, cSettingMcc, "001", true)
 					+ getSetting(null, null, uid, cSettingMnc, "01", true);
-		if (name.equals("getSimOperatorName"))
+		if (name.equals("getSimOperatorName") || name.equals("gsm.operator.alpha"))
 			return getSetting(null, null, uid, cSettingOperator, cDeface, true);
 		if (name.equals("getSimSerialNumber") || name.equals("getIccSerialNumber"))
 			return getSetting(null, null, uid, cSettingIccId, null, true);
