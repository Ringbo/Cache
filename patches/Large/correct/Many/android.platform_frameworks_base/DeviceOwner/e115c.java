diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DeviceOwner.java b/services/devicepolicy/java/com/android/server/devicepolicy/DeviceOwner.java
index 629dea2..3c46e40 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DeviceOwner.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DeviceOwner.java
@@ -208,7 +208,7 @@
                     int userId = Integer.parseInt(parser.getAttributeValue(null, ATTR_USERID));
                     mProfileOwners.put(userId,
                             new OwnerInfo(
-                                    profileOwnerPackageName, profileOwnerName, profileEnabled));
+                                    profileOwnerName, profileOwnerPackageName, profileEnabled));
                 } else {
                     throw new XmlPullParserException(
                             "Unexpected tag in device owner file: " + tag);
