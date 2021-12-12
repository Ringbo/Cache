diff --git a/spring-session-hazelcast/src/integration-test/java/org/springframework/session/hazelcast/AbstractHazelcastRepositoryITests.java b/spring-session-hazelcast/src/integration-test/java/org/springframework/session/hazelcast/AbstractHazelcastRepositoryITests.java
index 26b47e6..30557cf 100644
--- a/spring-session-hazelcast/src/integration-test/java/org/springframework/session/hazelcast/AbstractHazelcastRepositoryITests.java
+++ b/spring-session-hazelcast/src/integration-test/java/org/springframework/session/hazelcast/AbstractHazelcastRepositoryITests.java
@@ -224,7 +224,7 @@
 
 		assertThat(this.repository.findByIndexNameAndIndexValue(
 				FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME, username))
-						.isNotNull();
+						.hasSize(1);
 	}
 
 }
