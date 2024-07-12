console.log("Script loaded");

document.addEventListener("DOMContentLoaded", () => {
  let currentTheme = getTheme();
  changeTheme(currentTheme);
});

function changeTheme(theme) {
  // Set the initial theme to the web page
  changePageTheme(theme, "");

  // Set the listener to change theme button
  const changeThemeButton = document.querySelector("#theme_change_button");
  changeThemeButton.addEventListener("click", () => {
    let oldTheme = theme;
    console.log("Change theme button clicked");

    // Toggle theme
    if (theme === "dark") {
      theme = "light";
    } else {
      theme = "dark";
    }
    console.log(theme);
    changePageTheme(theme, oldTheme);
  });
}

// Set theme to local storage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

// Get theme from local storage
function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}

// Change the current page theme
function changePageTheme(newTheme, oldTheme) {
  // Update local storage with the new theme
  setTheme(newTheme);

  // Remove the old theme, if any
  if (oldTheme) {
    document.querySelector("html").classList.remove(oldTheme);
  }

  // Set the new theme
  document.querySelector("html").classList.add(newTheme);

  // Update the text of the button to reflect the new theme
  document.querySelector("#theme_change_button span").textContent = newTheme === "light" ? "Dark" : "Light";
}
