<h1>Desafio técnico Lenscope</h1>

Compra online de um óculos:<br>
O usuário insere informações da sua receita oftálmica, e o sistema deve exibir qual lente atende a sua necessidade (Prime ou Vision).<br>

<h3>Precisamos captar 4 parâmetros numéricos do usuário. Os dados são:</h3>
<p>
<ul>
<li>Grau esférico direito</li>
<li>Grau esférico esquerdo</li>
<li>Grau cilíndrico direito</li>
<li>Grau cilíndrico esquerdo</li>
</ul>
</p>

<h3>Requisitos das lentes:</h3>
<p>
  <strong>Prime:</strong> Grau esférico do olho esquerdo ou direito entre -3 e -12 e grau cilíndrico até -2. Se o cliente possuir grau cilíndrico, o grau esférico deve ficar entre -3 e -10.<br>
  <strong>Vision:</strong> Grau esférico do olho esquerdo ou direito entre 0 e -15 e grau cilíndrico até -5.
</p>

<p>Obs: o cliente pode inserir valores no parâmetros de grau esférico entre 0 e -15 e grau cilíndrico de 0 e -6.</p>

<h3>Resolução:</h3>
<p><strong>Classes:</strong><br>
<ul>
<li>CalcularGrau</li>
<li>VerificaGrau</li>
</ul>
</p>
<p>
<strong>Funções:</strong><br>
  A Classe CalcularGrau verifica qual lente se adapta a requisição do cliente.<br>
  A Classe VerificaGrau verifica se os valores inseridos nos parâmetros são válidos que devem ser iterados de 0,25 em 0,25.
</p>
