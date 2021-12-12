diff --git a/src/org/pentaho/di/job/JobMeta.java b/src/org/pentaho/di/job/JobMeta.java
index fe04432..710fa75 100644
--- a/src/org/pentaho/di/job/JobMeta.java
+++ b/src/org/pentaho/di/job/JobMeta.java
@@ -2745,9 +2745,9 @@
       	
       	// At the end, add ourselves to the map...
       	//
-      	String transMetaContent = jobMeta.getXML();
+      	String jobMetaContent = jobMeta.getXML();
       	
-      	definition = new ResourceDefinition(name, transMetaContent);
+      	definition = new ResourceDefinition(name, jobMetaContent);
       	definitions.put(fileObject.getName().getPath(), definition);
       }
     } catch (FileSystemException e) {
@@ -2756,7 +2756,7 @@
       throw new KettleException(Messages.getString("JobMeta.Exception.AnErrorOccuredReadingJob", getFilename()), e);
     }
 		
-		return filename;
+		return name;
 	}
 
 	/**
