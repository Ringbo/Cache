diff --git a/eureka-client/src/test/java/com/netflix/discovery/converters/EurekaCodecCompatibilityTest.java b/eureka-client/src/test/java/com/netflix/discovery/converters/EurekaCodecCompatibilityTest.java
index ebb9bc7..fff2172 100644
--- a/eureka-client/src/test/java/com/netflix/discovery/converters/EurekaCodecCompatibilityTest.java
+++ b/eureka-client/src/test/java/com/netflix/discovery/converters/EurekaCodecCompatibilityTest.java
@@ -275,7 +275,7 @@
                 new CodecWrappers.LegacyJacksonJson()
         );
 
-        verifyAllPairs(codingAction, Applications.class, jsonCodes);
+        verifyAllPairs(codingAction, ReplicationList.class, jsonCodes);
     }
 
     @Test
@@ -300,7 +300,7 @@
                 new CodecWrappers.LegacyJacksonJson()
         );
 
-        verifyAllPairs(codingAction, Applications.class, jsonCodes);
+        verifyAllPairs(codingAction, ReplicationListResponse.class, jsonCodes);
     }
 
     public void verifyAllPairs(Action2 codingAction, Class<?> typeToEncode, List<CodecWrapper> codecHolders) throws Exception {
