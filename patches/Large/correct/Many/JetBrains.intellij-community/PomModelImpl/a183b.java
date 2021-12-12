diff --git a/source/com/intellij/pom/core/impl/PomModelImpl.java b/source/com/intellij/pom/core/impl/PomModelImpl.java
index 886911c..991f28d 100644
--- a/source/com/intellij/pom/core/impl/PomModelImpl.java
+++ b/source/com/intellij/pom/core/impl/PomModelImpl.java
@@ -144,7 +144,7 @@
 
   private final Stack<Pair<PomModelAspect, PomTransaction>> myBlockedAspects = new Stack<Pair<PomModelAspect, PomTransaction>>();
 
-  public synchronized void runTransaction(PomTransaction transaction) throws IncorrectOperationException{
+  public void runTransaction(PomTransaction transaction) throws IncorrectOperationException{
     List<Throwable> throwables = new ArrayList<Throwable>(0);
     synchronized(PsiLock.LOCK){
       final PomModelAspect aspect = transaction.getTransactionAspect();
