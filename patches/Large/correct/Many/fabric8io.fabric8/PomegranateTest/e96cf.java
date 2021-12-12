diff --git a/fab/fabric-fab-core/src/test/java/org/fusesource/fabric/fab/PomegranateTest.java b/fab/fabric-fab-core/src/test/java/org/fusesource/fabric/fab/PomegranateTest.java
index f040463..703532c 100644
--- a/fab/fabric-fab-core/src/test/java/org/fusesource/fabric/fab/PomegranateTest.java
+++ b/fab/fabric-fab-core/src/test/java/org/fusesource/fabric/fab/PomegranateTest.java
@@ -44,7 +44,7 @@
 
         DefaultRepositorySystemSession session = new DefaultRepositorySystemSession();
         session.setLocalRepositoryManager(new SimpleLocalRepositoryManager(PathHelper.getUserMavenRepository()));
-        session.setOffline(true);
+        session.setOffline(false);
         session.setDependencySelector(
             new AndDependencySelector( new ScopeDependencySelector( "test", "provided" ),
                                        new OptionalDependencySelector(), new ExclusionDependencySelector() ) );
