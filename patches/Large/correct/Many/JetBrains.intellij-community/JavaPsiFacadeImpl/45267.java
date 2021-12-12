diff --git a/source/com/intellij/psi/impl/JavaPsiFacadeImpl.java b/source/com/intellij/psi/impl/JavaPsiFacadeImpl.java
index e1481e4..cbf473a 100644
--- a/source/com/intellij/psi/impl/JavaPsiFacadeImpl.java
+++ b/source/com/intellij/psi/impl/JavaPsiFacadeImpl.java
@@ -131,10 +131,10 @@
 
     if (psiManagerConfiguration.REPOSITORY_ENABLED) {
       myRepositoryManager = new RepositoryManagerImpl(psiManager);
-      myRepositoryElementsManager = new RepositoryElementsManager(psiManager);
+      myRepositoryElementsManager = new RepositoryElementsManager(psiManager, myRepositoryManager);
     } else {
       myRepositoryManager = new EmptyRepository.MyRepositoryManagerImpl();
-      myRepositoryElementsManager = new EmptyRepository.MyRepositoryElementsManager(psiManager);
+      myRepositoryElementsManager = new EmptyRepository.MyRepositoryElementsManager(psiManager, myRepositoryManager);
     }
 
     Disposer.register(project, this);
