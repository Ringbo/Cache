diff --git a/drools-core/src/main/java/org/drools/agent/impl/KnowledgeAgentConfigurationImpl.java b/drools-core/src/main/java/org/drools/agent/impl/KnowledgeAgentConfigurationImpl.java
index 96bd6d3..ad1738f 100644
--- a/drools-core/src/main/java/org/drools/agent/impl/KnowledgeAgentConfigurationImpl.java
+++ b/drools-core/src/main/java/org/drools/agent/impl/KnowledgeAgentConfigurationImpl.java
@@ -116,23 +116,23 @@
 
         setProperty( MonitorChangesetEventsOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( MonitorChangesetEventsOption.PROPERTY_NAME,
-                                                         MonitorChangesetEventsOption.NO.toString() ) );
+                                                         "true" ) );
 
         setProperty( ScanDirectoriesOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( ScanDirectoriesOption.PROPERTY_NAME,
-                                                         ScanDirectoriesOption.NO.toString() ) );
+                                                         "true" ) );
 
         setProperty( ScanResourcesOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( ScanResourcesOption.PROPERTY_NAME,
-                                                         ScanResourcesOption.NO.toString() ) );
+                                                         "true" ) );
 
         setProperty( NewInstanceOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( NewInstanceOption.PROPERTY_NAME,
-                                                         NewInstanceOption.NO.toString() ) );
+                                                         "true" ) );
 
         setProperty( UseKnowledgeBaseClassloaderOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( UseKnowledgeBaseClassloaderOption.PROPERTY_NAME,
-                                                         UseKnowledgeBaseClassloaderOption.NO.toString() ) );
+                                                         "false" ) );
 
         setProperty( ValidationTimeoutOption.PROPERTY_NAME,
                      this.chainedProperties.getProperty( ValidationTimeoutOption.PROPERTY_NAME,
@@ -167,7 +167,7 @@
         } else if ( name.equals( NewInstanceOption.PROPERTY_NAME ) ) {
             setNewInstance( StringUtils.isEmpty( value ) ? true : Boolean.parseBoolean( value ) );
         } else if ( name.equals( UseKnowledgeBaseClassloaderOption.PROPERTY_NAME ) ) {
-            setUseKBaseClassLoaderForCompiling( StringUtils.isEmpty( value ) ? true : Boolean.parseBoolean( value ) );
+            setUseKBaseClassLoaderForCompiling( StringUtils.isEmpty( value ) ? false : Boolean.parseBoolean( value ) );
         } else if ( name.equals( ValidationTimeoutOption.PROPERTY_NAME ) ) {
             try {
                 int millisec =  StringUtils.isEmpty( value ) ? 0 : Integer.parseInt( value );
