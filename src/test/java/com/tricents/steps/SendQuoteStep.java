package com.tricents.steps;

import org.junit.Assert;

import com.tricents.pages.SendQuotePage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import managers.TestContext;

public class SendQuoteStep {

	TestContext testContext;
	SendQuotePage sendQuotePage;
	
	public SendQuoteStep(TestContext testContext) {
		this.testContext = testContext;
		sendQuotePage = testContext.getPageObjectManager().getSendQuotePage();
	}
	
	@Quando("verifico que estou na guia Send Quote")
	public void verifico_que_estou_na_guia_send_quote() {
		Assert.assertTrue(sendQuotePage.getMenuSendQuoteActive().isDisplayed());
	}

	@Quando("digito o email do cliente {string}")
	public void digito_o_email_do_cliente(String email) {
		sendQuotePage.getTxtEMail().sendKeys(email);
	}

	@Quando("digito o telefone do cliente {string}")
	public void digito_o_telefone_do_cliente(String telefone) {
		sendQuotePage.getTxtPhone().sendKeys(telefone);
	}

	@Quando("digito o nome de usuario do cliente {string}")
	public void digito_o_nome_de_usuario_do_cliente(String usuario) {
		sendQuotePage.getTxtUsername().sendKeys(usuario);
	}

	@Quando("digito a senha do cliente {string}")
	public void digito_a_senha_do_cliente(String senha) {
		sendQuotePage.getTxtPassword().sendKeys(senha);
	}

	@Quando("digito a confirmacao de senha do cliente {string}")
	public void digito_a_confirmacao_de_senha_do_cliente(String confirmacaoSenha) {
		sendQuotePage.getTxtConfirmPassword().sendKeys(confirmacaoSenha);
	}
	
	@Quando("digito os comentarios opcionais da solicitacao do cliente")
	public void digito_os_comentarios_opcionais_da_solicitacao_do_cliente() {
		sendQuotePage.getTxtComments().sendKeys("Thanks Accenture");
	}
	
	@Quando("clico em Send de Send Quote")
	public void clico_em_send_de_send_quote() {
		sendQuotePage.getBtnSendEmail().click();
	}

	@Entao("valido a cotacao enviada com sucesso")
	public void valido_a_cotacao_enviada_com_sucesso() throws InterruptedException {
		Thread.sleep(15000);
		Assert.assertTrue(sendQuotePage.getLblEmailSenhSucess().isDisplayed());
	}
}
