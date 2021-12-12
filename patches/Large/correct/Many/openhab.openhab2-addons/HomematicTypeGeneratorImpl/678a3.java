diff --git a/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/type/HomematicTypeGeneratorImpl.java b/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/type/HomematicTypeGeneratorImpl.java
index dab0a7d..f017ee4 100644
--- a/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/type/HomematicTypeGeneratorImpl.java
+++ b/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/type/HomematicTypeGeneratorImpl.java
@@ -138,7 +138,7 @@
                 // generate group
                 ChannelGroupTypeUID groupTypeUID = UidUtils.generateChannelGroupTypeUID(channel);
                 ChannelGroupType groupType = channelTypeProvider.getChannelGroupType(groupTypeUID, Locale.getDefault());
-                if (groupType == null) {
+                if (groupType == null || device.isGatewayExtras()) {
                     String groupLabel = String.format("%s",
                             WordUtils.capitalizeFully(StringUtils.replace(channel.getType(), "_", " ")));
                     groupType = new ChannelGroupType(groupTypeUID, false, groupLabel, null, channelDefinitions);
