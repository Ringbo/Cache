diff --git a/maven-project/src/main/java/org/apache/maven/project/processor/ProcessorContext.java b/maven-project/src/main/java/org/apache/maven/project/processor/ProcessorContext.java
index c4b60d8..fd8d362 100644
--- a/maven-project/src/main/java/org/apache/maven/project/processor/ProcessorContext.java
+++ b/maven-project/src/main/java/org/apache/maven/project/processor/ProcessorContext.java
@@ -171,11 +171,12 @@
         }
         
         List<Processor> processors =
-            Arrays.<Processor> asList( new BuildProcessor( new ArrayList<Processor>() ),
-                           new ModuleProcessor(), new PropertiesProcessor(), new ParentProcessor(),
-                           new OrganizationProcessor(), new MailingListProcessor(), new IssueManagementProcessor(),
-                           new CiManagementProcessor(), new ReportingProcessor(), new RepositoriesProcessor(),
-                           new DistributionManagementProcessor(), new LicensesProcessor(), new ScmProcessor());        
+            Arrays.<Processor> asList( new BuildProcessor( new ArrayList<Processor>() ), new ModuleProcessor(),
+                                       new PropertiesProcessor(), new ParentProcessor(), new OrganizationProcessor(),
+                                       new MailingListProcessor(), new IssueManagementProcessor(),
+                                       new CiManagementProcessor(), new ReportingProcessor(),
+                                       new RepositoriesProcessor(), new DistributionManagementProcessor(),
+                                       new LicensesProcessor(), new ScmProcessor(), new PrerequisitesProcessor() );
         Model target = processModelsForInheritance(convertDomainModelsToMavenModels(domainModels), processors, true);
         
         PomClassicDomainModel model = convertToDomainModel( target, false );
