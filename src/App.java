import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean sim = false;
        boolean nao = false;

        System.out.println("ChatBot: Olá, tudo bem? ");
        String saudacao = sc.nextLine();
        System.out.println();

        do {
            switch (saudacao.toLowerCase()) { 
                case "sim":
                    sim = true;
                    System.out.println("ChatBot: Que bom!");
                    System.out.println("ChatBot: Fico muito feliz em ler essa sua mensagem.");
                    break;

                case "nao":
                    nao = true;
                    System.out.println("ChatBot: Você não está bem, certo? Porém, comigo, eu vou fazer o seu dia melhor!");
                    System.out.println("ChatBot: :)");
                    break;

                default:
                    System.out.println("ChatBot: Não entendi.");
                    System.out.println("ChatBot: Por favor, responda com 'sim' ou 'nao'.");
                    saudacao = sc.nextLine();
                    break;
            }
        } while (!sim && !nao);

        System.out.println();
 
        System.out.println("ChatBot: Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println();

        System.out.println("ChatBot: Seja bem-vindo " + nome + ".");
        System.out.println();

        System.out.println("ChatBot: Estou disponível para tirar todas as suas dúvidas!");
        System.out.println("ChatBot: É necessário que você faça as perguntas de acordo com o nosso banco de dados, pois estamos em desenvolvimento.");
        System.out.println();

        System.out.println("ChatBot: Sobre o que você gostaria de falar hoje? ");
        System.out.println();
        
        boolean sair = false; 

        do {
            System.out.println("ChatBot: Digite sua pergunta!");
            System.out.println("ChatBot: 'Projeto', 'IA', 'Java', 'Media'.");
            System.out.println("ChatBot: Para finalizar a conversa com o ChatBot digite 'sair'.");
            System.out.print("R: ");
            String perguntaChatBot = sc.nextLine();
            System.out.println();

            switch (perguntaChatBot.toLowerCase()) {
                case "projeto":
                    System.out.println("ChatBot: A sua dúvida sobre Projeto de Software se encaixa em qual assunto?");
                    System.out.println();
                    System.out.println("ChatBot: 1 - O que é um Projeto de Software?");
                    System.out.println("ChatBot: 2 - Como funciona um Projeto de Software?");
                    System.out.println("ChatBot: 3 - Quantidade de pessoas em um Projeto de Software?");
                    System.out.println();

                    boolean sairProjeto = false;
                    while (!sairProjeto) {
                        System.out.print("R: ");
                        String projetoI = sc.nextLine();
                        System.out.println();

                        switch (projetoI.toLowerCase()) {
                            case "1":
                                System.out.println("ChatBot: O projeto de software pode ser realizado de diferentes formas, mas uma das mais utilizadas e reconhecidas é o projeto baseado em padrões.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "2":
                                System.out.println("ChatBot: Um projeto de software é um esforço que envolve a criação, desenvolvimento, projeto, programação e suporte a um software.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "3":
                                System.out.println("ChatBot: Estabelecer um número máximo ideal de pessoas é, talvez, o mais complicado...");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "voltar":
                                System.out.println("ChatBot: Saindo da aba Projeto de Software.");
                                sairProjeto = true;
                                break;

                            default:
                                System.out.println("ChatBot: Resposta não reconhecida. Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;
                        }
                    }
                    break;

                case "ia":
                    System.out.println("ChatBot: A sua dúvida sobre IA se encaixa em qual assunto?");
                    System.out.println();
                    System.out.println("ChatBot: 1 - O que é uma IA?");
                    System.out.println("ChatBot: 2 - Como funciona a IA?");
                    System.out.println("ChatBot: 3 - Quantos tipos a IA pode ser dividida?");
                    System.out.println("ChatBot: 4 - Resumo sobre o que é uma IA?");
                    System.out.println();

                    boolean sairIA = false;
                    while (!sairIA) {
                        System.out.print("R: ");
                        String duvidaIA = sc.nextLine();
                        System.out.println();

                        switch (duvidaIA.toLowerCase()) {
                            case "1":
                                System.out.println("ChatBot: Uma Inteligência Artificial (IA) é um campo da ciência da computação focado em criar sistemas capazes de realizar tarefas que normalmente requerem inteligência humana.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "2":
                                System.out.println("ChatBot: O funcionamento da Inteligência Artificial (IA) envolve várias técnicas e algoritmos que permitem que máquinas processem informações, aprendam com dados, tomem decisões e realizem tarefas de maneira automatizada.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "3":
                                System.out.println("ChatBot: A IA pode ser dividida em dois tipos principais.");
                                System.out.println("ChatBot: IA Estreita (ou fraca): Projetada para realizar uma tarefa específica, como reconhecer rostos em fotos, fazer recomendações de filmes, ou prever o tráfego em tempo real. Esta é a forma mais comum de IA que usamos hoje.");
                                System.out.println("ChatBot: IA Geral (ou forte): Teoricamente, essa IA seria capaz de entender, aprender e aplicar conhecimento em um nível igual ou superior ao de um ser humano, resolvendo qualquer problema cognitivo. Esta forma de IA ainda é uma meta distante para a ciência e tecnologia atuais.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "4":
                                System.out.println("ChatBot: Em resumo, a IA busca simular aspectos da inteligência humana para melhorar processos, automatizar tarefas, e criar sistemas mais eficientes e inteligentes.");
                                System.out.println();
                                System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;

                            case "voltar":
                                System.out.println("ChatBot: Saindo da aba IA.");
                                sairIA = true;
                                break;

                            default:
                                System.out.println("ChatBot: Resposta não reconhecida. Por favor, responda com 'voltar' ou selecione outra opção.");
                                break;
                        }
                    }
                    break;

                case "java":
                System.out.println("ChatBot: A sua dúvida sobre JAVA se encaixa em qual assunto?");
                System.out.println();
                System.out.println("ChatBot: 1 - O que é a Linguagem Java?");
                System.out.println("ChatBot: 2 - Como funciona a Linguagem Java?");
                System.out.println("ChatBot: 3 - Processos que são realizados na Linguagem Java?");
                System.out.println("ChatBot: 4 - Resumo sobre o que é uma Linguagem Java?");
                System.out.println();

                boolean sairJAVA = false;
                while (!sairJAVA) {
                    System.out.print("R: ");
                    String duvidaJAVA = sc.nextLine();
                    System.out.println();

                    switch (duvidaJAVA.toLowerCase()) {
                        case "1":
                            System.out.println("ChatBot: Java é uma linguagem de programação de propósito geral, orientada a objetos, que foi desenvolvida pela Sun Microsystems (agora parte da Oracle Corporation) e lançada em 1995.");
                            System.out.println();
                            System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                            break;

                        case "2":
                            System.out.println("ChatBot: Java funciona com base na compilação do código-fonte para um bytecode intermediário, que é executado pela Máquina Virtual Java (JVM).");
                            System.out.println();
                            System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                            break;

                        case "3":
                            System.out.println("ChatBot: Compilação; O código Java é escrito em arquivos .java e depois compilado para bytecode pelo compilador javac. Esse bytecode é independente de plataforma.");
                            System.out.println("ChatBot: Execução; O bytecode é interpretado ou compilado em tempo de execução pela JVM, que é específica para cada plataforma (Windows, Mac, Linux, etc.), permitindo que o mesmo código seja executado em diferentes sistemas operacionais.");
                            System.out.println("ChatBot: Gerenciamento de Memória; Java usa um coletor de lixo (garbage collector) para gerenciar a memória automaticamente, o que minimiza problemas como vazamento de memória e gerenciamento manual de alocação e desalocação.");
                            System.out.println();
                            System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                            break;

                        case "4":
                            System.out.println("ChatBot: Java é uma linguagem de programação orientada a objetos, criada para ser independente de plataforma. Ela é amplamente usada para desenvolvimento de aplicações web, desktop, móveis (como Android), sistemas empresariais e muitos outros tipos de software.");
                            System.out.println();
                            System.out.println("ChatBot: Por favor, responda com 'voltar' ou selecione outra opção.");
                            break;

                        case "voltar":
                            System.out.println("ChatBot: Saindo da aba Linguagem Java.");
                            sairJAVA = true;
                            break;

                        default:
                            System.out.println("ChatBot: Resposta não reconhecida. Por favor, responda com 'voltar' ou selecione outra opção.");
                            break;
                    }
                }
                break;

                case "media":
                System.out.println("ChatBot: Você deseja calcular a média simples?");
                System.out.println("ChatBot: Digite 'sim' ou 'não'.");
                System.out.println();
            
                boolean sairMedia = false;
            
                do {
                    System.out.print("R: ");
                    String perguntaMedia = sc.nextLine();
                    System.out.println();
            
                    switch (perguntaMedia.toLowerCase()) {
                        case "sim":
                            System.out.print("ChatBot: Digite o primeiro número: ");
                            float numI = sc.nextFloat();
            
                            System.out.print("ChatBot: Digite o segundo número: ");
                            float numII = sc.nextFloat();
            
                            sc.nextLine();
            
                            float media = (numI + numII) / 2;
            
                            System.out.printf("ChatBot: A média é: %.2f.\n", media);
            
                            System.out.println();
                            System.out.println("ChatBot: Por favor, responda com 'voltar' ou digite 'sim' para realizar o cálculo de outra media.");
                            break;
            
                        case "voltar":
                            System.out.println("ChatBot: Saindo da aba Media Simples.");
                            sairMedia = true;
                            break;
            
                        case "nao":
                            System.out.println("ChatBot: Ok, retornando ao menu principal.");
                            sairMedia = true;
                            break;
            
                        default:
                            System.out.println("ChatBot: Resposta não reconhecida. Por favor, responda com 'voltar', 'sim', ou 'não'.");
                            break;
                    }
            
                } while (!sairMedia);
                break;            
                
                case "sair":
                    System.out.println("Saindo do chatbot. Até mais!");
                    sair = true;
                    break;

                default:
                    System.out.println("ChatBot: Desculpe, não entendi a sua pergunta. Tente usar palavras-chave como 'Projeto', 'IA', 'Java' ou você pode digitar 'Sair'.");
                    break;
            }
        } while (!sair);
    }
}