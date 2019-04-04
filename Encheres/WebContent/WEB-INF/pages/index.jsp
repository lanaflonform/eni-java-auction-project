<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>


<jsp:include page="../fragments/header.jsp">
	<jsp:param value="Liste des encheres" name="title" />
</jsp:include>

<h2>Liste des enchères</h2>
<hr>

<h3>Filtres</h3>
<form id="filterForm" action="/Encheres/webapi/enchere/" method="post">
	<div class="form-row accueil">
		<div class="col-md-8">
			<div class="form-group row">
				<label for="inputPassword" class="col-md-4 col-form-label">Recherche par nom</label>		
				<input 
					type="search"
					name="nameFilter" 
					class="form-control col-md-8" 
					placeholder="Le nom de l'article contient"
				>
			</div>
			<div class="form-group row">
				<label for="SelectCategorie" class="col-md-4 col-form-label">Catégorie</label>
			    <select 
			    	class="form-control col-md-8" 
			    	id="SelectCategorie"
			    	name="categorie" 
			    >
					<c:forEach var="cat" items="${ listeCategories}">
						<option value="${ cat.getNoCategorie() }">${ cat.getLibelle() }</option>
					</c:forEach>
						<option value="-1">Toutes</option>
			    </select>
			</div>

			<fieldset class="form-group">
				<div class="row">
					<div class="col-md-6">
						<div class="custom-control custom-radio custom-control-inline">
							<input 
								type="radio" 
								id="achatsRadio"
								name="radioButtons" 
								value="mesAchats"
								class="custom-control-input"
								checked
							> 
								<label class="custom-control-label" for="achatsRadio">Mes achats</label>
						</div>
					</div>
					<div class="col-md-6">
						<div class="custom-control custom-radio custom-control-inline col-md-6">
							<input 
								type="radio" 
								id="ventesRadio"
								name="radioButtons" 
								value="mesVentes"
								class="custom-control-input"
							> 
								<label class="custom-control-label" for="ventesRadio">Mes ventes</label>
						</div>
					</div>
				</div>
			</fieldset>
			<div class="form-group row">
				<div class="col-md-6" id="mesEncheresCheckboxGroup">
					<div class="form-check">
					  <input 
					  		class="form-check-input" 
					  		type="checkbox" 
					  		name="encheresOuvertes" 
					  		id="mesEncheresCheckbox1"
				  		>
					  <label class="form-check-label" for="mesEncheresCheckbox1">
					    Enchères ouvertes
					  </label>
					</div>
					<div class="form-check">
					  <input 
					  		class="form-check-input" 
					  		type="checkbox" 
					  		name="encheresEnCours" 
					  		id="mesEncheresCheckbox2"
			  			>
					  <label class="form-check-label" for="mesEncheresCheckbox2">
					    Mes enchères en cours
					  </label>
					</div>
					<div class="form-check">
					  <input 
					  		class="form-check-input" 
					  		type="checkbox" 
					  		name="encheresRemportees" 
					  		id="mesEncheresCheckbox3"
			  			>
					  <label class="form-check-label" for="mesEncheresCheckbox3">
					    Mes enchères remportées
					  </label>
					</div>
				</div>
				<div class="col-md-6" id="mesVentesCheckboxGroup">
					<div class="form-check">
					  <input 
				  			class="form-check-input" 
			  				type="checkbox" 
			  				name="ventesEnCours" 
			  				id="MesVentesCheckbox1"
			  				disabled
		  				>
					  <label class="form-check-label" for="MesVentesCheckbox1">
					    Mes ventes en cours
					  </label>
					</div>
					<div class="form-check">
					  <input 
					  		class="form-check-input" 
					  		type="checkbox" 
					  		name="ventesNonRemportees" 
					  		id="MesVentesCheckbox2"
					  		disabled
				  		>
					  <label class="form-check-label" for="MesVentesCheckbox2">
					    Ventes non remportées
					  </label>
					</div>
					<div class="form-check">
					  <input 
				  			class="form-check-input" 
			  				type="checkbox" 
			  				name="ventesTerminees" 
			  				id="MesVentesCheckbox3"
			  				disabled
		  				>
					  <label class="form-check-label" for="MesVentesCheckbox3">
					    Ventes terminées
					  </label>
					</div>
				</div>			
			</div>
			
		</div>
		<div class="col-md-4">
			<button type="submit" class="btn btn-light">Rechercher</button>
		</div>
	</div>
</form>
<div id="dashboard" class="justify-content-center">
<!-- 	<div class="card mb-3 mr-1 ml-1 dashboard-tile"> -->
<!-- 	  <div class="row no-gutters"> -->
<!-- 	    <div class="col-md-4"> -->
<%-- 	      <img src="${ pageContext.request.contextPath }/img/alienware.jpg" class="card-img p-1" alt="image ordinateur"> --%>
<!-- 	    </div> -->
<!-- 	    <div class="col-md-8"> -->
<!-- 	      <div class="card-body"> -->
<!-- 	        <h5 class="card-title">Object Name</h5> -->
<!-- 	        <p class="card-text">Price</p> -->
<!-- 	        <p class="card-text">End date</p> -->
<!-- 	        <p class="card-text">Pseudo</p> -->
<!-- 	      </div> -->
<!-- 	    </div> -->
<!-- 	  </div> -->
<!-- 	</div> -->
</div>


<!-- <table class="table" id="table"> -->

<!-- </table> -->
<!-- <pre id="succes"> -->
	
<!-- </pre> -->

<pre id="echec">

</pre>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/accueil.js"></script>
<jsp:include page="../fragments/footer.jsp"></jsp:include>