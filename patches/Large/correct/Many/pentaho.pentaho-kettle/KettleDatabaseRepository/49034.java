diff --git a/src/org/pentaho/di/repository/kdr/KettleDatabaseRepository.java b/src/org/pentaho/di/repository/kdr/KettleDatabaseRepository.java
index b868fdf..3e3a2aa 100644
--- a/src/org/pentaho/di/repository/kdr/KettleDatabaseRepository.java
+++ b/src/org/pentaho/di/repository/kdr/KettleDatabaseRepository.java
@@ -478,9 +478,12 @@
 		directoryDelegate.delRepositoryDirectory(dir);
 	}
 
+	/**
+	 * @deprecated
+	 */
 	public ObjectId renameRepositoryDirectory(RepositoryDirectory dir) throws KettleException {
     	securityProvider.validateAction(RepositoryOperation.RENAME_DIRECTORY);
-		return directoryDelegate.renameRepositoryDirectory(dir);
+		return directoryDelegate.renameRepositoryDirectory(dir.getObjectId(), dir, dir.getName());
 	}
 	
 	 public ObjectId renameRepositoryDirectory(ObjectId id, RepositoryDirectory newParentDir, String newName) throws KettleException {
