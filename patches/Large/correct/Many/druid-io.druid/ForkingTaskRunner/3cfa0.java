diff --git a/merger/src/main/java/com/metamx/druid/merger/coordinator/ForkingTaskRunner.java b/merger/src/main/java/com/metamx/druid/merger/coordinator/ForkingTaskRunner.java
index b6ebdf4..0f6c869 100644
--- a/merger/src/main/java/com/metamx/druid/merger/coordinator/ForkingTaskRunner.java
+++ b/merger/src/main/java/com/metamx/druid/merger/coordinator/ForkingTaskRunner.java
@@ -159,7 +159,7 @@
                                     String.format(
                                         "-D%s=%s",
                                         propName.substring(CHILD_PROPERTY_PREFIX.length()),
-                                        System.getProperty(propName)
+                                        props.getProperty(propName)
                                     )
                                 );
                               }
