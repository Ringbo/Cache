diff --git a/hazelcast/src/main/java/com/hazelcast/config/ConfigXmlGenerator.java b/hazelcast/src/main/java/com/hazelcast/config/ConfigXmlGenerator.java
index f9effc8..64922d7 100644
--- a/hazelcast/src/main/java/com/hazelcast/config/ConfigXmlGenerator.java
+++ b/hazelcast/src/main/java/com/hazelcast/config/ConfigXmlGenerator.java
@@ -135,7 +135,7 @@
 			xml.append("<time-to-live-seconds>").append(m.getTimeToLiveSeconds()).append("</time-to-live-seconds>");
 			xml.append("<max-idle-seconds>").append(m.getMaxIdleSeconds()).append("</max-idle-seconds>");
 			xml.append("<cache-value>").append(m.isCacheValue()).append("</cache-value>");
-			xml.append("<read-backup-data>").append(m.isCacheValue()).append("</read-backup-data>");
+			xml.append("<read-backup-data>").append(m.isReadBackupData()).append("</read-backup-data>");
 			xml.append("<merge-policy>").append(m.getMergePolicy()).append("</merge-policy>");
 			
 			if(m.getMapStoreConfig() != null) {
