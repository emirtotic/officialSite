<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">

<title>Emir Totić - Software Engineer</title>

<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="Emir Totić Software Engineer IT Tehnologies Java Programming">
<meta name="author" content="Emir Totić">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/magnific-popup.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">

<!-- Main css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/tooplate-style.css">

</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">

<!-- PRE LOADER -->
<div class="preloader">
     <div class="spinner">
          <span class="spinner-rotate"></span>
     </div>
</div>


<!-- HOME SECTION -->
<div class="container">
     <div class="row">
          <section id="home" class="parallax-section">

               <div class="col-md-offset-1 col-md-10 col-sm-12">
                    <div class="home-wrapper">
                         <h3 class="wow fadeInUp" data-wow-delay="0.4s">Emir Totić</h3>
                         <h2 class="wow fadeInUp" data-wow-delay="0.6s">Software Engineer</h2>
                         <a href="#about" class="wow fadeInUp smoothScroll arrow-btn" data-wow-delay="1s"><i class="fa fa-angle-double-down"></i></a>
                    </div>
               </div>

          </section>
     </div>
</div>


<!-- ABOUT SECTION -->
<section id="about" class="parallax-section">
     <div class="container">
          <div class="row">

               <div class="col-md-4 col-sm-8">
                    <img src="images/about-image2.JPG" class="wow fadeInUp img-responsive" data-wow-delay="0.2s" alt="about image">
                    <div class="wow fadeInUp" data-wow-delay="0.4s">
                         <h3>Emir Totić</h3>
                         <p>Diplomirani inzenjer Informatike i Računarstva</p>
                         <a href="https://www.linkedin.com/in/emirtotic/" target="_blank">LinkedIn</a>
                         <a href="https://github.com/emirtotic" target="_blank">GitHub</a>
                         <a href="https://www.instagram.com/emir.totic" target="_blank">Instagram</a>
                         <a href="#" target="_blank">Facebook</a>
                    </div>
               </div>

               <div class="col-md-8 col-sm-12">
                    <div class="about-thumb">
                         <div class="wow fadeInUp section-title" data-wow-delay="0.6s">
                              <h3>O meni</h3>
                              <h2>Od malena sam pokazivao sklonost i interesovanje za IT svet!</h2>
                         </div>
                         <div class="wow fadeInUp" data-wow-delay="0.8s">
                              <p style="text-align:justify">Rodjen sam u Užicu, 02. februara 1992. godine. Osnovnu i srednju školu sam završio u Arilju, 
                              a uporedo sam završio i muzičku školu u Užicu. Pored interesovanja za muziku i sport, oduvek sam pokazivao interesovanje za 
                              IT svet. U septembru 2014. upisujem fakultet za Računarstvo i Informatiku na Internacionalnom Univerzitetu u Novom Pazaru na 
                              kom sam diplomirao ocenom 10 iz predmeta Zaštita računarskih sistema na temu Biometrijska zaštita. Nakon završetka osnovnih 
                              akademskih studija odlučio sam da nastavim sa profesionalnim usavršavanjem u cilju osposobljavanja za buduće zanimanje. Kako 
                              se tokom školovanja pojavila žejla da zavirim u svet programiranja, u oktobru 2019. godine odlučujem da upišem obuku za Java 
                              programiranje u <strong><a href="https://cubes.edu.rs/" target="_blank">Cubes školi</a></strong> u Beogradu. Obzirom na to da nastava još uvek
                              traje, nemam radno iskustvo na području IT sveta i samog programiranja, ali se iskreno nadam da ću u kratkom vremenskom periodu
                              pronaći posao ili praksu nakon završetka. Imam veliku želju da napredujem na stručnom planu, da savladavam nove tehnologije i 
                              stičem nove veštine. Takodje posedujem i veoma dobre komunikacijske veštine koje su rezultat pre svega životnog iskustva, 
                              dugogodisnjeg profesionalnog rada u svetu muzike, kao i angažmana na sportskom planu gde sam tokom poluprofesionalne karijere 
                              naučio šta znači biti deo tima i timski igrač.
                              
                              <br><br>
                              
                              Neke od do sada stečenih veština i znanja u svetu IT-a pored poznavanja operativnog rada na platformama Linux i Windows:
                              
                              <br><br>
                              
                              Java Core i koncept objektno-orijentisanog programiranja, Java advanced, Java Spring framework, Java hibernate framework, 
                              MySQL jezik, HTML, CSS (basic level)... Pored navedenih, posedujem odlično znanje Adobe Photoshop-a kao i Cubase software-a za 
                              muzičku produkciju.
                              
                              <br>
                              
                              Naglasio bih i odlično poznavanje engleskog jezika na C1 nivou što podrazumeva odlično razumevanje, čitanje i pisanje. 
                                  
                             </p>
                         </div>
                    </div>
               </div>

          </div>
     </div>
</section>



<!-- CONTACT SECTION -->
<section id="contact" class="parallax-section">
     <div class="container">
          <div class="row">

               <div class="col-md-12 col-sm-12">
                    <!-- SECTION TITLE -->
                    <div class="wow fadeInUp section-title" data-wow-delay="0.2s">
                         <h2>Kontaktirajte me</h2>
                         <p>Kontaktirajte me ukoliko nudite posao ili ste zainteresovani za saradnju, očekujem Vas!</p>
                    </div>
               </div>

               <div class="col-md-12 col-sm-12">
                     <!-- CONTACT FORM HERE -->
                    <div class="wow fadeInUp" data-wow-delay="0.6s">
                        <form:form role="form" action="contact-save" modelAttribute="contact" >
                        
                              <div class="col-md-6 col-sm-6">
                                   <form:input path="nameAndSurname" type="text" class="form-control" name="name" placeholder="Ime i Prezime"/>
                              </div>
                              <div class="col-md-6 col-sm-6">
                                   <form:input path="email" type="email" class="form-control" name="email" placeholder="Email"/>
                              </div>
                              <div class="col-md-12 col-sm-12">
                                   <form:textarea path="message" class="form-control" rows="5" name="message" placeholder="Poruka"/>
                              </div>
                              <div class="col-md-offset-3 col-md-6 col-sm-offset-3 col-sm-6">
                                   <button id="submit" type="submit" class="form-control" value="send-mail" name="submit">Pošalji poruku</button>
                              </div>
                        </form:form>
                    </div>
               </div>

          </div>
     </div>
</section>


<!-- FOOTER SECTION -->
<footer id="footer" class="parallax-section">
    <div class="container">
        <div class="row">

               <div class="wow fadeInUp col-md-4 col-sm-4" data-wow-delay="0.2s">
                    <h4 style="text-align:center">Emir Totić - Software Engineer</h4>
                    <p style="text-align:center">Diplomirani inzenjer Računarstva i Informatike. Trenutno pohadjam <a href="https://cubes.edu.rs/" target="_blank">Cubes školu</a> programiranja u Beogradu.</p>
               </div>

               <div class="wow fadeInUp col-md-4 col-sm-4" data-wow-delay="0.4s">
                    <div class="support-cus">
                         <h4 style="text-align:center">Adresa</h4>
                         <p style="text-align:center">Vespučijeva br. 3 <br> 11000 Beograd</p>
                    </div>
                    <div class="support-cus">
                         <h4 style="text-align:center">Kontakt informacije</h4>
                         <p style="text-align:center">emirtotic@gmail.com</p>
                         <p style="text-align:center">Tel: (+381) 60 695 61 33</p>
                    </div>
               </div>
               
                <div class="wow fadeInUp col-md-4 col-sm-4" data-wow-delay="0.6s">
                    <h4 style="text-align:center">Popunjavanjem forme možete preuzeti moj kompletan CV</h4>
                    <form:form role="form" class="newsletter" modelAttribute="downloader" action="downloaders-save" method="get" target="_blank">
                         <form:input path="email" name="email" type="email" class="form-control" id="email" placeholder="Vaša Email Adresa"/>
                         <button name="submit" value="sign-up" class='form-control'>Preuzmi</button>
                    </form:form>
               </div>
               

               <div class="col-md-12 col-sm-12 clearfix">
                    <div class="dash-line"></div>
               </div>
                  
                    <div class="col-md-12 col-sm-12 clearfix">
                    <h5>HVALA NA POSETI</h5>
               </div>
               
               
               
<!-- SCRIPTS -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.parallax.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.magnific-popup.min.js"></script>
<script src="${pageContext.request.contextPath}/js/magnific-popup-options.js"></script>
<script src="${pageContext.request.contextPath}/js/smoothscroll.js"></script>
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/js/custom.js"></script>

</body>
</html>