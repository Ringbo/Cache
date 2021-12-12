diff --git a/services/backup/java/com/android/server/backup/Trampoline.java b/services/backup/java/com/android/server/backup/Trampoline.java
index 83d134a..b89bad5 100644
--- a/services/backup/java/com/android/server/backup/Trampoline.java
+++ b/services/backup/java/com/android/server/backup/Trampoline.java
@@ -139,7 +139,7 @@
     // IBackupManager binder API
     @Override
     public void dataChanged(String packageName) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.dataChanged(packageName);
         }
@@ -148,7 +148,7 @@
     @Override
     public void clearBackupData(String transportName, String packageName)
             throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.clearBackupData(transportName, packageName);
         }
@@ -156,7 +156,7 @@
 
     @Override
     public void agentConnected(String packageName, IBinder agent) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.agentConnected(packageName, agent);
         }
@@ -164,7 +164,7 @@
 
     @Override
     public void agentDisconnected(String packageName) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.agentDisconnected(packageName);
         }
@@ -172,7 +172,7 @@
 
     @Override
     public void restoreAtInstall(String packageName, int token) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.restoreAtInstall(packageName, token);
         }
@@ -180,7 +180,7 @@
 
     @Override
     public void setBackupEnabled(boolean isEnabled) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.setBackupEnabled(isEnabled);
         }
@@ -188,7 +188,7 @@
 
     @Override
     public void setAutoRestore(boolean doAutoRestore) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.setAutoRestore(doAutoRestore);
         }
@@ -196,7 +196,7 @@
 
     @Override
     public void setBackupProvisioned(boolean isProvisioned) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.setBackupProvisioned(isProvisioned);
         }
@@ -204,25 +204,25 @@
 
     @Override
     public boolean isBackupEnabled() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.isBackupEnabled() : false;
     }
 
     @Override
     public boolean setBackupPassword(String currentPw, String newPw) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.setBackupPassword(currentPw, newPw) : false;
     }
 
     @Override
     public boolean hasBackupPassword() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.hasBackupPassword() : false;
     }
 
     @Override
     public void backupNow() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.backupNow();
         }
@@ -233,7 +233,7 @@
             boolean includeShared, boolean doWidgets, boolean allApps,
             boolean allIncludesSystem, boolean doCompress, boolean doKeyValue, String[] packageNames)
                     throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.adbBackup(fd, includeApks, includeObbs, includeShared, doWidgets,
                     allApps, allIncludesSystem, doCompress, doKeyValue, packageNames);
@@ -242,7 +242,7 @@
 
     @Override
     public void fullTransportBackup(String[] packageNames) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.fullTransportBackup(packageNames);
         }
@@ -250,7 +250,7 @@
 
     @Override
     public void adbRestore(ParcelFileDescriptor fd) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.adbRestore(fd);
         }
@@ -260,7 +260,7 @@
     public void acknowledgeFullBackupOrRestore(int token, boolean allow, String curPassword,
             String encryptionPassword, IFullBackupRestoreObserver observer)
                     throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.acknowledgeAdbBackupOrRestore(token, allow,
                     curPassword, encryptionPassword, observer);
@@ -269,38 +269,38 @@
 
     @Override
     public String getCurrentTransport() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getCurrentTransport() : null;
     }
 
     @Override
     public String[] listAllTransports() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.listAllTransports() : null;
     }
 
     @Override
     public ComponentName[] listAllTransportComponents() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.listAllTransportComponents() : null;
     }
 
     @Override
     public String[] getTransportWhitelist() {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getTransportWhitelist() : null;
     }
 
     @Override
     public String selectBackupTransport(String transport) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.selectBackupTransport(transport) : null;
     }
 
     @Override
     public void selectBackupTransportAsync(ComponentName transport,
             ISelectBackupTransportCallback listener) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.selectBackupTransportAsync(transport, listener);
         }
@@ -308,38 +308,38 @@
 
     @Override
     public Intent getConfigurationIntent(String transport) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getConfigurationIntent(transport) : null;
     }
 
     @Override
     public String getDestinationString(String transport) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getDestinationString(transport) : null;
     }
 
     @Override
     public Intent getDataManagementIntent(String transport) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getDataManagementIntent(transport) : null;
     }
 
     @Override
     public String getDataManagementLabel(String transport) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getDataManagementLabel(transport) : null;
     }
 
     @Override
     public IRestoreSession beginRestoreSession(String packageName, String transportID)
             throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.beginRestoreSession(packageName, transportID) : null;
     }
 
     @Override
     public void opComplete(int token, long result) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.opComplete(token, result);
         }
@@ -347,26 +347,26 @@
 
     @Override
     public long getAvailableRestoreToken(String packageName) {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.getAvailableRestoreToken(packageName) : 0;
     }
 
     @Override
     public boolean isAppEligibleForBackup(String packageName) {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.isAppEligibleForBackup(packageName) : false;
     }
 
     @Override
     public int requestBackup(String[] packages, IBackupObserver observer,
             IBackupManagerMonitor monitor, int flags) throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         return (svc != null) ? svc.requestBackup(packages, observer, monitor, flags) : null;
     }
 
     @Override
     public void cancelBackups() throws RemoteException {
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.cancelBackups();
         }
@@ -376,7 +376,7 @@
     public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
         if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
 
-        IBackupManagerService svc = mService;
+        BackupManagerServiceInterface svc = mService;
         if (svc != null) {
             svc.dump(fd, pw, args);
         } else {
