diff --git a/common/src/main/java/tachyon/security/group/UserToGroupsMappingService.java b/common/src/main/java/tachyon/security/group/UserToGroupsMappingService.java
index 8a5f740..a6b7a97 100644
--- a/common/src/main/java/tachyon/security/group/UserToGroupsMappingService.java
+++ b/common/src/main/java/tachyon/security/group/UserToGroupsMappingService.java
@@ -33,7 +33,7 @@
  * mapping and protects against mapping inconsistencies between servers and clients in a Tachyon
  * cluster.
  */
-public class UserToGroupsMappingService {
+public final class UserToGroupsMappingService {
   private static final Logger LOG = LoggerFactory.getLogger(UserToGroupsMappingService.class);
 
   private final GroupMappingService mGroupMappingService;
