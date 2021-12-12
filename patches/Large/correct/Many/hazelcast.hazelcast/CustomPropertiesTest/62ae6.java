diff --git a/hazelcast-hibernate/src/test/java/com/hazelcast/hibernate/CustomPropertiesTest.java b/hazelcast-hibernate/src/test/java/com/hazelcast/hibernate/CustomPropertiesTest.java
index db5aa61..1484302 100644
--- a/hazelcast-hibernate/src/test/java/com/hazelcast/hibernate/CustomPropertiesTest.java
+++ b/hazelcast-hibernate/src/test/java/com/hazelcast/hibernate/CustomPropertiesTest.java
@@ -85,10 +85,10 @@
     public void testSuperClient() throws Exception {
         HazelcastInstance main = Hazelcast.newHazelcastInstance(new ClasspathXmlConfig("hazelcast-custom.xml"));
         Properties props = getDefaultProperties();
-        props.setProperty(CacheEnvironment.USE_SUPER_CLIENT, "true");
+        props.setProperty(CacheEnvironment.USE_LITE_MEMBER, "true");
         SessionFactory sf = createSessionFactory(props);
         HazelcastInstance hz = HazelcastAccessor.getHazelcastInstance(sf);
-        assertTrue(hz.getCluster().getLocalMember().isSuperClient());
+        assertTrue(hz.getCluster().getLocalMember().isLiteMember());
         assertEquals(2, main.getCluster().getMembers().size());
         sf.close();
         main.getLifecycleService().shutdown();
