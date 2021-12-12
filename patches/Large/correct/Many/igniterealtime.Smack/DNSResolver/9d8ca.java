diff --git a/smack-core/src/main/java/org/jivesoftware/smack/util/dns/DNSResolver.java b/smack-core/src/main/java/org/jivesoftware/smack/util/dns/DNSResolver.java
index dde1889..79de3e0 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/util/dns/DNSResolver.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/util/dns/DNSResolver.java
@@ -1,6 +1,6 @@
 /**
  *
- * Copyright 2013-2016 Florian Schmaus
+ * Copyright 2013-2017 Florian Schmaus
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -50,7 +50,7 @@
     public final HostAddress lookupHostAddress(String name, int port, List<HostAddress> failedAddresses, DnssecMode dnssecMode) {
         checkIfDnssecRequestedAndSupported(dnssecMode);
         List<InetAddress> inetAddresses = lookupHostAddress0(name, failedAddresses, dnssecMode);
-        if (inetAddresses == null) {
+        if (inetAddresses == null || inetAddresses.isEmpty()) {
             return null;
         }
         return new HostAddress(name, port, inetAddresses);
