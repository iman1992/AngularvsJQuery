/**
 * 
 * We have introduced two different Javascript libraries/frameworks this semester. Explain the differences/purposes of both.
 * 
 * JQuery was designed mostly to provide a way to manipulate the DOM in an easier, less restricted manner. It is capable of finding elements, changing the DOM and adding tags and fields, basically it directly interacts with the nuts and bolts of the HTML. AngularJS is built on top of JQuery, adding additional functionality such as MVC to the functionality. It's a more high-level language than JQuery, being that instead of directly manipulating the nuts and bolts of the HTML, it works more in binding and providing values, filters, background computation and the like. Basically, if you're only interested in DOM and not data CRUD, JQuery is sufficient, but AngularJS contains much more robust and capable tools for CRUD operations. 
 * 
 * Explain the term DOM, related to browsers.
 * 
 * DOM is Document Object Model, a convention for showing and interacting with objects in HTML. In HTML, it's represented by the different tags and their hierarchies. <head> can contain <title>, <body> can contain <div>, <ul>, etc. It gives the browser a structured way to know what to show and how to show it, and in which order and context.
 * 
 * Explain the pros and cons with designing Single Page Applications
 * 
 * SPA is really good for creating responsive and sleek websites. It's faster, more sleek, and is also much less server-side intensive, as it does not need to make a serverside call every time you want to view a different page. It's also easier to maintain state with SPA.
 * Cons include that having a large SPA will make the initial loading time much longer. SEO is also much more difficult to do in an SPA, and XSS attacks are easier to perform. 
 * 
 * Explain the benefits from having a backend that exposes all data to clients via a REST API.
 * 
 * It allows a website to have an OO backend that is capable of more complex tasks than what would be sensible of possible to do in AngularJS. It also allows for database connectivity without direct connection to the database from the front-end, so you are capable of creating a much more secure validation layer between those two.
 * 
 */