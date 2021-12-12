diff --git a/src/main/com/mongodb/ReplicaSetStatus.java b/src/main/com/mongodb/ReplicaSetStatus.java
index 78517bb..8942393 100644
--- a/src/main/com/mongodb/ReplicaSetStatus.java
+++ b/src/main/com/mongodb/ReplicaSetStatus.java
@@ -81,7 +81,7 @@
     @Override
 	public String toString() {
 	StringBuffer sb = new StringBuffer();
-	sb.append("{replSetName: '" + _setName );
+	sb.append("{replSetName: '" + _setName.get() );
 	sb.append("', closed:").append(_closed.get()).append(", ");
 	sb.append("nextResolveTime:'").append(new Date(_nextResolveTime).toString()).append("', ");
 	sb.append("members : [ ");
@@ -330,11 +330,11 @@
 
                 if (res.containsField("setName")) {
 	                String setName = res.get( "setName" ).toString();
-	                if ( _setName == null ){
+	                if ( _setName.get() == null ){
 	                    _setName.set(setName);
 	                    _logger.set( Logger.getLogger( _rootLogger.getName() + "." + setName ) );
 	                }
-	                else if ( !_setName.equals( setName ) ){
+	                else if ( !_setName.get().equals( setName ) ){
 	                    _logger.get().log( Level.SEVERE , "mis match set name old: " + _setName.get() + " new: " + setName );
 	                    return;
 	                }
@@ -345,7 +345,7 @@
                 if (_ok == true) {
                     _logger.get().log( Level.WARNING , "Server seen down: " + _addr, e );
                 } else if (Math.random() < 0.1) {
-                    _logger.get().log( Level.WARNING , "Server seen down: " + _addr );
+                    _logger.get().log( Level.WARNING , "Server seen down: " + _addr, e );
                 }
                 _ok = false;
             }
@@ -484,7 +484,7 @@
                 return n;
         }
 
-        if ( _lastPrimarySignal != null ){
+        if ( _lastPrimarySignal.get() != null ){
             n = findNode( _lastPrimarySignal.get() );
             if (n != null) {
                 n.update();
