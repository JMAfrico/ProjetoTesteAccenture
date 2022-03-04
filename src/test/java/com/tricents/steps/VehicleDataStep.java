package com.tricents.steps;

import org.junit.Assert;
import com.tricents.pages.VehicleDataPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import managers.TestContext;

public class VehicleDataStep {
	
	TestContext testContext;
	VehicleDataPage vehicleDataPage;
			
	public VehicleDataStep(TestContext testContext) {		
		this.testContext = testContext;
		vehicleDataPage = testContext.getPageObjectManager().getCotacaoPage();
		vehicleDataPage.navigateToHomePage();
	}
	
	@Dado("que estou no site de cotacao")
	public void que_estou_no_site_de_cotacao() {
		vehicleDataPage.verificoQueEstouNoSiteDeCotacao();
	}
	
	@Dado("que estou na guia Vehicle Data")
	public void que_estou_na_guia_vehicle_data() {
		Assert.assertTrue(vehicleDataPage.getMenuEnterVehicleDataActive().isDisplayed());
	}

	@Quando("seleciono a marca do veiculo {string}")
	public void seleciono_a_marca_do_veiculo(String marca) {
		vehicleDataPage.getSelectMake().sendKeys(marca);
	}

	@Quando("digito a forca do motor do veiculo {string} KW")
	public void digito_a_forca_do_motor_do_veiculo_kw(String forca) {
		vehicleDataPage.getTxtEnginePerform().sendKeys(forca);
	}

	@Quando("seleciono a data de fabricacao do veiculo {string}")
	public void seleciono_a_data_de_fabricacao_do_veiculo(String data) {
		vehicleDataPage.getTxtDateofManufacture().sendKeys(data);
	}

	@Quando("seleciono o numero de assentos do veiculo {string}")
	public void seleciono_o_numero_de_assentos_do_veiculo(String numeroAssentos) {
		vehicleDataPage.getSelectNumberofSeats().sendKeys(numeroAssentos);
	}

	@Quando("seleciono o tipo de combustivel do veiculo {string}")
	public void seleciono_o_tipo_de_combustivel_do_veiculo(String tipoCombustivel) {
		vehicleDataPage.getSelectFuelType().sendKeys(tipoCombustivel);
	}

	@Quando("digito o preco de tabela do veiculo {string}")
	public void digito_o_preco_de_tabela_do_veiculo(String precoTabela) {
		vehicleDataPage.getTxtListPrice().sendKeys(precoTabela);
	}

	@Quando("digito o numero da placa do veiculo {string}")
	public void digito_o_numero_da_placa_do_veiculo(String placa) {
		vehicleDataPage.getTxtLicensePlateNumber().sendKeys(placa);
	}

	@Quando("digito a quilometragem do veiculo {string}")
	public void digito_a_quilometragem_do_veiculo(String quilometragem) {
		vehicleDataPage.getTxtAnnualMileage().sendKeys(quilometragem);
	}

	@Quando("clico em next")
	public void clico_em_next() {
		vehicleDataPage.getBtnNext().click();
	}
	
	@Quando("seleciono a modelo do veiculo {string}")
	public void seleciono_a_modelo_do_veiculo(String modelo) {
		vehicleDataPage.getSelectModel().sendKeys(modelo);
	}

	@Quando("digito a cilindrada do veiculo {string} ccm")
	public void digito_a_cilindrada_do_veiculo_ccm(String cilindradas) {
		vehicleDataPage.getTxtCylinderCapacity().sendKeys(cilindradas);
	}

	@Quando("seleciono a opcao de motorista conduz pelo lado direito")
	public void seleciono_a_opcao_de_motorista_conduz_pelo_lado_direito() {
		vehicleDataPage.getSelectRightHandDrive().click();
	}

	@Quando("seleciono o numero de assentos do lado do motorista {string}")
	public void seleciono_o_numero_de_assentos_do_lado_do_motorista(String assentosMotorista) {
		vehicleDataPage.getSelectNumberofSeatsMotorcycle().sendKeys(assentosMotorista);
	}

	@Quando("digito a carga util do veiculo {string}")
	public void digito_a_carga_util_do_veiculo(String cargaUtil) {
		vehicleDataPage.getTxtPayload().sendKeys(cargaUtil);
	}

	@Quando("digito o peso do veiculo {string}")
	public void digito_o_peso_do_veiculo(String pesoTotal) {
		vehicleDataPage.getTxtTotalWeight().sendKeys(pesoTotal);
	}
}