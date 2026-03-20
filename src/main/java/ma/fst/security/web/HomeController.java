package ma.fst.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController: il ne faut pas l'utiliser ici, sinon  Spring considère que tout ce qu'on retourne dans les méthodes doit être écrit directement dans le corps de la réponse (en texte ou JSON)


@Controller // On utilise @Controller ici!
public class HomeController {

    @GetMapping("/")
    public String home(org.springframework.security.core.Authentication authentication) {
        if (authentication != null && authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            return "redirect:/admin/dashboard"; // Redirige l'admin
        }
        return "redirect:/user/dashboard"; // Redirige l'user (par défaut)
    }



    @GetMapping("/user/dashboard")
    @ResponseBody// dit à Spring de renvoyer le texte, pas un fichier
    public String userDashboard() {
        return "Ici Espace utilisateur -> accessible aux rôles USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Ici Espace administrateur -> réservé au rôle ADMIN.";
    }


    //C'est pour afficher la page d'accueil
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
