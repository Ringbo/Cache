diff --git a/hibernate-entitymanager/src/main/java/org/hibernate/jpa/boot/scan/spi/AbstractScannerImpl.java b/hibernate-entitymanager/src/main/java/org/hibernate/jpa/boot/scan/spi/AbstractScannerImpl.java
index da5af94..3d2c441 100644
--- a/hibernate-entitymanager/src/main/java/org/hibernate/jpa/boot/scan/spi/AbstractScannerImpl.java
+++ b/hibernate-entitymanager/src/main/java/org/hibernate/jpa/boot/scan/spi/AbstractScannerImpl.java
@@ -68,7 +68,7 @@
 
 		if ( persistenceUnit.getPersistenceUnitRootUrl() != null ) {
 			final ArchiveDescriptor descriptor = buildArchiveDescriptor( persistenceUnit.getPersistenceUnitRootUrl(), true, scanOptions );
-			final ArchiveContext context = buildArchiveContext( persistenceUnit, false, resultCollector );
+			final ArchiveContext context = buildArchiveContext( persistenceUnit, true, resultCollector );
 			descriptor.visitArchive( context );
 		}
 
