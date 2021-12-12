diff --git a/cas-server-core/src/main/java/org/jasig/cas/AbstractCentralAuthenticationService.java b/cas-server-core/src/main/java/org/jasig/cas/AbstractCentralAuthenticationService.java
index fdc3a31..a7dd32d 100644
--- a/cas-server-core/src/main/java/org/jasig/cas/AbstractCentralAuthenticationService.java
+++ b/cas-server-core/src/main/java/org/jasig/cas/AbstractCentralAuthenticationService.java
@@ -91,13 +91,13 @@
     @Autowired
     protected ApplicationEventPublisher eventPublisher;
 
-    /** TicketRegistry for storing and retrieving tickets as needed. */
+    /** {@link TicketRegistry}  for storing and retrieving tickets as needed. */
     @NotNull
     @Resource(name="ticketRegistry")
     protected TicketRegistry ticketRegistry;
 
     /**
-     * AuthenticationManager for authenticating credentials for purposes of
+     * {@link AuthenticationManager} for authenticating credentials for purposes of
      * obtaining tickets.
      */
     @NotNull
@@ -105,14 +105,14 @@
     protected AuthenticationManager authenticationManager;
 
     /**
-     * UniqueTicketIdGenerator to generate ids for TicketGrantingTickets
+     * UniqueTicketIdGenerator to generate ids for {@link TicketGrantingTicket}s
      * created.
      */
     @NotNull
     @Resource(name="ticketGrantingTicketUniqueIdGenerator")
     protected UniqueTicketIdGenerator ticketGrantingTicketUniqueTicketIdGenerator;
 
-    /** Map to contain the mappings of service->UniqueTicketIdGenerators. */
+    /** Map to contain the mappings of service to {@link UniqueTicketIdGenerator}s. */
     @NotNull
     @Resource(name="uniqueIdGeneratorsMap")
     protected Map<String, UniqueTicketIdGenerator> uniqueTicketIdGeneratorsForService;
@@ -341,9 +341,10 @@
      * Ensure that the service is found and enabled in the service registry.
      * @param registeredService the located entry in the registry
      * @param service authenticating service
-     * @throws UnauthorizedServiceException
+     * @throws UnauthorizedServiceException if service is unauthorized
      */
-    protected final void verifyRegisteredServiceProperties(final RegisteredService registeredService, final Service service) {
+    protected final void verifyRegisteredServiceProperties(final RegisteredService registeredService,
+                                                           final Service service) throws UnauthorizedServiceException {
         if (registeredService == null) {
             final String msg = String.format("ServiceManagement: Unauthorized Service Access. "
                     + "Service [%s] is not found in service registry.", service.getId());
